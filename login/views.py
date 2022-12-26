from django.shortcuts import render, redirect
from django.views.generic.base import View
from django.template import loader
from django.http.response import HttpResponse

# Create your views here.
class LoginView(View):
    def get(self, request):
        rest_api_key = "c1a86be3c92378280cc12d13d382754b"
        redirect_uri = "https://localhost:8000/login/kakao"
        kakao_auth_api = "https://kauth.kakao.com/oauth/authorize?response_type=code"
        
        return redirect(
            f'{kakao_auth_api}?client_id={rest_api_key}&redirect_uri={redirect_uri}&response_type=code'
            )
    #Redirect URI : https://localhost:8000/login/kakao
    
    def post(self, request):
        pass
    
class KakaoCallbackView(View):
    def get(self, request):
        pass
    
    def post(self, request):
        rest_api_key = "c1a86be3c92378280cc12d13d382754b"
        code = request.GET.get("code")
        redirect_uri = "https://localhost:8000/login/kakao"
        
        """
        access token request
        """
        token_request = request.get(
            f"https://kauth.kakao.com/oauth/token?grant_type=authorization_code&client_id={rest_api_key}&redirect_uri={redirect_uri}&code={code}"
            )
        token_req_json = token_request.json()
        error=token_req_json.get(error)