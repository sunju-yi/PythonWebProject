from django.db import models

# Create your models here.
class User(models.Model):
    bs_id = models.CharField(max_length=50, verbose_name="아이디", primary_key=True)
    bs_passwd = models.CharField(max_length=50, verbose_name="비밀번호",null=False)
    bs_nickname = models.CharField(max_length=50,verbose_name="별명", null=False)
    bs_email = models.EmailField(max_length=50, verbose_name="이메일")
    bs_tel = models.CharField(max_length=20, verbose_name="전화번호")
    bs_address = models.TextField(verbose_name="주소")
    bs_useablepoint = models.IntegerField(verbose_name="가용포인트", null=False, blank=True)
    bs_totalpoint = models.IntegerField(verbose_name="누적포인트", null=False, blank=True)
    bs_social = models.CharField(max_length=1, verbose_name="소셜아이디", null=False, blank=True)
    bs_image= models.ImageField(verbose_name="유저이미지")
    bs_regtime = models.DateTimeField(auto_now_add=True, verbose_name="가입일", null=False, blank=True)
    
    
class Message(models.Model):
    bs_sendid = models.ForeignKey(User, verbose_name="발신자",on_delete=models.CASCADE)
    bs_receiveid = models.ForeignKey(User, verbose_name="수신자", on_delete=models.CASCADE)
    bs_content = models.TextField(verbose_name="쪽지내용")
    bs_regtime = models.DateTimeField(auto_now_add=True, verbose_name="전송시간", null=False, blank=True)
    
class Advertisement(models.Model):
    bs_id = models.ForeignKey(User, verbose_name="작성자",on_delete=models.CASCADE)
    bs_adserial = models.AutoField(verbose_name="광고글번호", null=False, primary_key=True)
    bs_adregtime=models.DateTimeField(auto_now_add=True, verbose_name="광고요청일", null=False, blank=True)
    bs_adshowtime = models.IntegerField(verbose_name="노출횟수", null=False)
    bs_adcontent = models.ImageField(verbose_name="광고이미지")
    bs_adurl = models.TextField(verbose_name="이미지url")
    bs_adsaveurl = models.TextField(verbose_name="이미지저장url")
    
class Survey(models.Model):
    bs_id = models.ForeignKey(User, verbose_name="답변유저",on_delete=models.CASCADE)
    bs_answer = models.IntegerField(verbose_name="답변번호")
    