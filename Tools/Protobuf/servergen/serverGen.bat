@echo off
echo ��ǰĿ¼��%cd%

echo Э���ļ�·��
set SOURCE_FOLDER=..\proto

echo Java�ļ�����·��
set JAVA_TARGET_PATH=..\..\..\XiaoGameServer\src\main\java

echo Java������·��
set JAVA_COMPILER_PATH=.\protoc.exe

echo ɾ��֮ǰ�������ļ�
del %JAVA_TARGET_PATH%\org\redstone\protobuf\msg\*.java /f /s /q

echo ��������proto�ļ������� Java ����
for /f "delims=" %%i in ('dir /b "%SOURCE_FOLDER%\*.proto"') do (
    echo %JAVA_COMPILER_PATH% --java_out=%JAVA_TARGET_PATH% %SOURCE_FOLDER%\%%i
    %JAVA_COMPILER_PATH% --proto_path=%SOURCE_FOLDER% --java_out=%JAVA_TARGET_PATH% %SOURCE_FOLDER%\%%i
)
echo Э���������
pause