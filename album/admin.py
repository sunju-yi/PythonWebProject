from django.contrib import admin
from album.models import Album


# Register your models here.
admin.site.register(Album)

class AlbumAdmin(admin.ModelAdmin):
    list_display=('a_no','a_type','a_title','a_note','a_image','a_count','a_datetime','a_usage')