@echo off
echo ɾ��֮ǰ������cs�ļ�
del	.\*.cs /f /s /q
echo copy proto��ʱ�ļ�
xcopy ..\proto\*.proto .\
echo ��ʼ����cs�ļ�...
for /f "delims=" %%i in ('dir /b ".\*.proto"') do (
	echo protogen -i:%%i -o:%%~ni.cs
    protogen  -i:%%i -o:%%~ni.cs
)
echo cs�ļ��������
echo ɾ����ʱproto�ļ�
del .\*.proto /f /s /q