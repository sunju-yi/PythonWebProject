'''
Created on 2022. 12. 17.

@author: joonj
'''
from django.urls.conf import path
from django.views.generic.base import TemplateView
from login import views

urlpatterns = [
    path("kakaocallback", views.KakaoCallbackView.as_view(template_name = "main.html")),
]