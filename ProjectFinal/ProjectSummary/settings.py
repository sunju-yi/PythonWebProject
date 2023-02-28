"""
Django settings for ProjectSummaryEx project.

Generated by 'django-admin startproject' using Django 4.1.3.

For more information on this file, see
https://docs.djangoproject.com/en/4.1/topics/settings/

For the full list of settings and their values, see
https://docs.djangoproject.com/en/4.1/ref/settings/
"""
import json
from django.conf import settings
from django.core.exceptions import ImproperlyConfigured
from pathlib import Path
import os
from django.conf.global_settings import STATICFILES_DIRS, STATIC_ROOT, MEDIA_URL,\
    MEDIA_ROOT, SESSION_EXPIRE_AT_BROWSER_CLOSE
from numpy.distutils.fcompiler import none

# Build paths inside the project like this: BASE_DIR / 'subdir'.
BASE_DIR = Path(__file__).resolve().parent.parent

secret_file = os.path.join(BASE_DIR, 'secrets.json')
# Quick-start development settings - unsuitable for production
# See https://docs.djangoproject.com/en/4.1/howto/deployment/checklist/

with open(secret_file) as f:
    secrets = json.loads(f.read())

def get_secret(setting, secrets=secrets):
    try:
        return secrets[setting]
    except KeyError:
        error_msg : "Set the {0} environment viriable".format(setting)
        raise ImproperlyConfigured(error_msg)
CSRF_TRUSTED_ORIGINS=['https://www.filmal.net']

#Django가 세션을 쿠키에 넣어 두기 때문에 해당 설정을 넣어주는 것.
SESSION_EXPIRE_AT_BROWSER_CLOSE = True
LOG_FILE = os.path.join(os.path.dirname(__file__), '../log', 'myLog.log')

LOGGING = {
        "version" : 1,
        "disable_existing_loggers" : False,
        "formatters" : {
            "format1" : {
                "format" : "[%(asctime)s] %(levelname)s [%(name)s:%(lineno)s] %(message)s",
                "datefmt" : "%Y-%m-%d %H:%M:%S",
                },
            "format2" : {
                "format" : "%(levelname)s %(message)s",
                },
            },
        "handlers" : {
            "file" : {
                "level" : "INFO",
                "class" : "logging.handlers.RotatingFileHandler",
                "filename" : os.path.join(BASE_DIR, "log/logfile.log"),
                "encoding" : "UTF-8",
                "maxBytes" : 1024 * 1024 * 5,
                "backupCount" : 3,
                "formatter" : "format1",
                },
            "console" : {
                "level" : "DEBUG",
                "class" : "logging.StreamHandler",
                "formatter" : "format2",
                },
            },
    "loggers":{
        "django":{
            "handlers":["console"],
            "propagate":True,
            "level":"WARNING",
            },
        "django.request":{
            "handlers":["console"],
            "propagate":True,
            "level":"WARNING",
            },
        "kakao":{
            "handlers":["file"],
            "propagate":True,
            "level":"INFO", #로그 쌓을때    debug하면 다 쌓임.
            },
        "naver":{
            "handlers":["file"],
            "propagate":True,
            "level":"INFO",
            },
        "board":{
            "handlers":["file"],
            "propagate":True,
            "level":"INFO",
            },
        "note":{
            "handlers":["file"],
            "propagate":True,
            "level":"INFO",
            },
        "polls":{
            "handlers":["file"],
            "propagate":True,
            "level":"INFO",
            },
        "portfolio":{
            "handlers":["file"],
            "propagate":True,
            "level":"INFO",
            }
        },
    }

# SECURITY WARNING: keep the secret key used in production secret!
SECRET_KEY = get_secret("SECRET_KEY")
# SECURITY WARNING: don't run with debug turned on in production!
DEBUG = True

ALLOWED_HOSTS = ["localhost", "192.168.56.1","192.168.1.31", "192.168.0.21", "127.0.0.1", "master","www.filmal.net"]

# Application definition

INSTALLED_APPS = [
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
    #12/28추가
    'kakao',
    #1/2추가
    'naver',
    #1/10 추가
    'board',
    'django_summernote',
    'polls',
    #1/11 추가
    'home',
    #1/13
    'note',
    'portfolio',
    'mathfilters'
]

X_FRAME_OPTIONS = 'SAMEORIGIN'

MIDDLEWARE = [
    'django.middleware.security.SecurityMiddleware',   # 이거랑
    'django.contrib.sessions.middleware.SessionMiddleware',
    'django.middleware.common.CommonMiddleware',
    'django.middleware.csrf.CsrfViewMiddleware',
    'django.contrib.auth.middleware.AuthenticationMiddleware',   #이게 session 이용가능하게 하는 것.
    'django.contrib.messages.middleware.MessageMiddleware',
    'django.middleware.clickjacking.XFrameOptionsMiddleware',
]

ROOT_URLCONF = 'ProjectSummary.urls'

TEMPLATES = [
    {
        'BACKEND': 'django.template.backends.django.DjangoTemplates',
        'DIRS': [os.path.join(BASE_DIR,"templates")],
        'APP_DIRS': True,
        'OPTIONS': {
            'context_processors': [
                'django.template.context_processors.debug',
                'django.template.context_processors.request',
                'django.contrib.auth.context_processors.auth',
                'django.contrib.messages.context_processors.messages',
            ],
        },
    },
]

WSGI_APPLICATION = 'ProjectSummary.wsgi.application'


# Database
# https://docs.djangoproject.com/en/4.1/ref/settings/#databases

# DATABASES = {
#     'default': {
#         'ENGINE': 'django.db.backends.sqlite3',
#         'NAME': BASE_DIR / 'db.sqlite3',
#     }
# }

DATABASES = { 
    'default': {
        'ENGINE': 'django.db.backends.mysql', # mysql 엔진 설정
        'NAME': 'bsdb', # 데이터베이스 이름
        'USER': 'admin', # 데이터베이스 연결시 사용할 유저 이름
        'PASSWORD': 'admin1234', # 유저 패스워드
        'HOST': 'sample-db.cuy0rgqhle4s.ap-northeast-2.rds.amazonaws.com',
        'PORT': '3306',
        'OPTIONS': {
            'init_command': "SET sql_mode='STRICT_TRANS_TABLES'",
            'charset': 'utf8mb4', # 테이블 생성 자동으로 해줄때 쓸 인코딩,, 이거안하면 밑에꺼해도 효과 엑스
            'use_unicode': True,
        },
    }
} 

# Password validation
# https://docs.djangoproject.com/en/4.1/ref/settings/#auth-password-validators

AUTH_PASSWORD_VALIDATORS = [
    {
        'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
    },
]


# Internationalization
# https://docs.djangoproject.com/en/4.1/topics/i18n/

LANGUAGE_CODE = 'ko-kr'

TIME_ZONE = 'Asia/Seoul'

USE_I18N = True

USE_TZ = True


# Static files (CSS, JavaScript, Images)
# https://docs.djangoproject.com/en/4.1/howto/static-files/

STATIC_URL = 'static/'
STATICFILES_DIRS = [os.path.join(BASE_DIR,'static')]
STATIC_ROOT = os.path.join(BASE_DIR,'.static')

MEDIA_URL = 'media/'
MEDIA_ROOT = os.path.join(BASE_DIR, 'media')

# Default primary key field type
# https://docs.djangoproject.com/en/4.1/ref/settings/#default-auto-field

DEFAULT_AUTO_FIELD = 'django.db.models.BigAutoField'

SUMMERNOTE_CONFIG = {
    'attachment_filesize_limit': 5 * 1024 * 1024
}

FILE_UPLOAD_HANDLERS = [
    'django.core.files.uploadhandler.MemoryFileUploadHandler',
    'django.core.files.uploadhandler.TemporaryFileUploadHandler',
]


MAX_UPLOAD_SIZE = 5242880
DATA_UPLOAD_MAX_MEMORY_SIZE = None
FILE_UPLOAD_MAX_MEMORY_SIZE = 5242880
DATA_UPLOAD_MAX_NUMBER_FIELDS = None
