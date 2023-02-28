#!/usr/bin/python3

import sys
import json
from collections import OrderedDict

for i in sys.stdin:
	item = i.split(",")
	print(item)
	file_data = OrderedDict()
	
	file_data["board_id"] = item[0]
	file_data["title"] = item[1]
	file_data["contents"] = item[2]
	file_data["substance"] = item[3]
	file_data["write_dttm"] = item[4]
	file_data["board_name"] = item[5]
	file_data["update_dttm"] = item[6]
	file_data["hits"] = item[7]
	file_data["files"] = item[8]
	file_data["filename"] = item[9]
	file_data["accept"] = item[10]
	file_data["like_count"] = item[11]
	file_data["dislike_count"] = item[12]
	file_data["category"] = item[13]
	file_data["follow_count"] = item[14]
	file_data["user_id"] = item[15].rstrip("\n")
	# print(file_data)
	with open("/home/bit/01/board.json", "a+", encoding="utf-8") as make_file:
		json.dump(file_data, make_file, ensure_ascii=False)
	with open("/home/bit/01/board.json", "a+", encoding="utf-8") as make_file:
		make_file.write("\n")
