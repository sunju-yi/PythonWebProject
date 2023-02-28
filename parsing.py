#!/usr/bin/python3
'''
Created on 2023. 2. 8.

@author: joonj
'''

import sys
import json
from collections import OrderedDict
from datetime import datetime
import csv

total_log = []
for line in sys.stdin:
	person_log = []
    
   	#메인 페이지로 이동 / 정렬
	user_main = line.find("메인페이지")
	user_arrange = line.find("정렬")
	user_login = line.find("로그인")
	user_logout = line.find("로그아웃")
	if (user_main != -1) or (user_arrange != -1) or (user_login != -1) or (user_logout != -1):
		continue
    
	#각 게시판 통합 페이지, 투표, 글작성, 게임 진행
	user_skip1 = line.find(",접근")
	user_skip2 = line.find(",로접근")
	user_skip3 = line.find(",로접근.")
	user_vote = line.find("투표")
	user_writing = line.find("글작성")
	user_loose = line.find("패배")
	user_win = line.find("승리")
	user_modify = line.find("수정")
	user_report = line.find("신고")
	user_comment_remove = line.find("댓글")
	user_re_remove = line.find("대댓글")
	if (user_skip1 != -1) or (user_skip2 != -1) or (user_skip3 != -1) or (user_vote != -1) or (user_writing != -1) or (user_loose != -1) or (user_win != -1) or (user_modify != -1) or (user_report != -1) or (user_comment_remove != -1) or (user_re_remove != -1):
		continue
    
	#포트폴리오, 쪽지, 검색
	user_portfolio = line.find("포트폴리오")
	user_message = line.find("쪽지")
	user_search = line.find("검색")
	if(user_portfolio != -1) or (user_message != -1) or (user_search != -1):
		continue

	#사용자 로그 시간 추출
	user_action_time_start = line.find("[")
	user_action_time_end = line.find("]")
	user_action_time = line[user_action_time_start+1:user_action_time_end]
	person_log.append(user_action_time)

	#사용자 닉네임 추출
	user_name_start = line.find("]", user_action_time_end+1)
	user_name_end = line.find("*")
	user = line[user_name_start+2:user_name_end]
	if user !="None":
		person_log.append(user)
	else:
		continue

	#사용자가 본 게시글 번호 추출
	user_click_board_start = line.find("게시판종류,")
	user_click_board_start2 = line.find("카테고리,")
	user_click_board_end = line.find(",게시글번호")
	if(user_click_board_start!=-1):
		user_click_board = line[user_click_board_start+6:user_click_board_end]
		person_log.append(user_click_board)
	if(user_click_board_start2 != -1):
		user_click_board = line[user_click_board_start2 +5:user_click_board_end]
		person_log.append(user_click_board)
		
	#사용자가 게시물을 다운로드 받은 경우
	user_download_file_start = line.find("b'")
	user_download_file_end = line.find("',를다운로드")
	if(user_download_file_start != -1):
		#user_download_file = line[user_download_file_start+2:user_download_file_end]
		#print(user_download_file)
		person_log.append("파일다운로드")
    
	#사용자가 게시물에 좋아요를 누른 경우
	user_like_start = line.find("좋아요")
	user_cancellation = line.find("취소")
	if (user_cancellation != -1)and (user_like_start != -1):
		person_log.append("좋아요취소")
		user_cancellation = -1
	elif (user_cancellation == -1) and (user_like_start != -1):
		person_log.append("좋아요")
        
	#사용자가 게시물에 싫어요를 누른 경우
	user_dislike_start = line.find("싫어요")
	user_cancellation = line.find("취소")
	if (user_cancellation != -1) and (user_dislike_start != -1):
		person_log.append("싫어요취소")
		user_cancellation = -1
	elif (user_cancellation == -1) and (user_dislike_start != -1):
		person_log.append("싫어요")   
    
	#사용자가 게시물에 찜를 누른 경우
	user_follow_start = line.find("찜")
	user_cancellation = line.find("해제")
	if (user_cancellation != -1) and (user_follow_start != -1):
		person_log.append("찜취소")
		user_cancellation = -1
	elif (user_cancellation == -1) and (user_follow_start != -1):
		person_log.append("찜") 
    
	#user delete it's item
	user_delete_start = line.find("삭제")
	if(user_delete_start != -1):
		person_log.append("삭제")
	#print("person_log",person_log)
	total_log.append(person_log)
total_log.sort(key = lambda x : (x[1], x[0]))

print("total_log", total_log)

#summarize as same user
summarize_value=[]
for i in range(len(total_log)-1):
	temp =[]
	temp.append(total_log[i][1])
	temp.append(total_log[i][2])
	difference = True #same person checker
	
	#같은 유저인 경우
	if total_log[i][1] == total_log[i+1][1]:
		difference = False #total_log의 앞뒤가 같은 유저임.
		get_time = total_log[i][0]
		get_time = datetime.strptime(get_time, '%Y-%m-%d %H:%M:%S')
		compare_time = total_log[i+1][0]
		compare_time = datetime.strptime(compare_time, '%Y-%m-%d %H:%M:%S')
		actual_time = compare_time - get_time
		td = actual_time.total_seconds()
		
		if (td > 1) and (td < 101):
			temp.append(td)
		else:
			temp.append(0)
			
		try : 
			test = total_log[i][3]
			temp.append(test)
		except:
			pass
			
		#same user & same board_id (in S.V. list) checker
		if summarize_value != []:
			in_sum = False #current user not in S.V. List
			item_in_sum = False
			for k in summarize_value:
				#same user
				if k[0] == temp[0] :
					in_sum=True
					# same board_id
					if k[1]==temp[1]:
						item_in_sum=True
						k[2] += temp[2]
						#if it has like, dislike, delete, download, follow
						try:
							temp[3]
							if temp[3] in k:
								pass
							else : 
								k.append(temp[3])
						except: 
							pass
					#different board_id
					# else:
					# 	#print("total_log[i+1]",total_log[i+1])
			# there is no temp user in S.V. List
			if in_sum == False:
				summarize_value.append(temp)
			
			#there is not item in S.V. List
			if in_sum== True and item_in_sum == False:
				summarize_value.append(temp)
		else:
			#summarize_value is empty
			summarize_value.append(temp)
			
	else : 
		#앞/뒤 유저가 다름
		non_user_i = True
		non_user_j = True
		for z in summarize_value:
			if total_log[i][1] in z:
				non_user_i = False
			# if total_log[i+1][1] in z:
			# 	non_user_j = False
			# 	continue
		if non_user_i == True:
			try:
				temp.append(0)
				temp.append(total_log[i][3])
				summarize_value.append(temp)
			except:
				temp.append(0)
				summarize_value.append(temp)
		'''
		if non_user == True:
			try : 
				total_log[i+1][3]
				summarize_value.append([total_log[i+1][1],total_log[i+1][2], 0,total_log[i+1][3]])
			except : 
				summarize_value.append([total_log[i+1][1],total_log[i+1][2], 0])
		'''
	
	#print("summarize_value", summarize_value)
	
for i in summarize_value :
	if '삭제' in i:
		board_id = i[1]
		summarize_value.remove(i)
		for j in summarize_value:
			if j[1] == board_id:
				summarize_value.remove(j)

summarize_value.sort(key = lambda x : (x[0], x[1]))
#print(summarize_value)

for i in summarize_value:
	try:
		if "좋아요" in i and "좋아요취소" in i:
			i.remove("좋아요")
			i.remove("좋아요취소")
		if "싫어요" in i and "싫어요취소" in i:
			i.remove("싫어요")
			i.remove("싫어요취소")
		if "찜" in i and "찜취소" in i:
			i.remove("찜")
			i.remove("찜취소")
	except:
		pass


#json formatting
for i in summarize_value:
	file_data = OrderedDict()
	rating = 0
	print("i",i)
	file_data["nickname"] = i[0]
	file_data["board_id"] = int(i[1])
	rating += int(i[2])*0.01
	if "좋아요" in i:
		rating +=3 
	if '싫어요' in i:
		rating -= 3
	if '파일다운로드' in i:
		rating += 5
	if '찜' in i:
		rating += 4
		
	file_data["rating"] = rating
	
	with open("/home/bit/01/review.json", "a+", encoding="utf-8") as make_file:
		json.dump(file_data, make_file, ensure_ascii=False)
	with open("/home/bit/01/review.json", "a+", encoding="utf-8") as make_file:
		make_file.write("\n")
