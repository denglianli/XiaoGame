@echo off
cd F:\github_projects\XiaoGame\XiaoGameServer\src\main\java\org\redstone\protobuf\proto
echo ��ǰCMDĬ��Ŀ¼��%cd%

echo Э���ļ�·��
set SOURCE_FOLDER=.
echo %SOURCE_FOLDER%

echo C#�ļ�����·��
set CS_TARGET_PATH=.

echo C#������·��
set CS_COMPILER_PATH=.\protogen.exe

echo ɾ��֮ǰ�������ļ�
del %CS_TARGET_PATH%\*.cs /f /s /q

::���������ļ�
for /f "delims=" %%i in ('dir /b "%SOURCE_FOLDER%\*.proto"') do (
    
    ::���� C# ����
    echo %CS_COMPILER_PATH% -i:%SOURCE_FOLDER%\%%i -o:%CS_TARGET_PATH%\%%~ni.cs
    %CS_COMPILER_PATH% -i:%SOURCE_FOLDER%\%%i -o:%CS_TARGET_PATH%\%%~ni.cs
)
echo Э��������ϡ�

pause