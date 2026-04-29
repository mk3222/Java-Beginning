@echo off
cd /d "%~dp0"

git add .

git diff --cached --quiet
if %errorlevel% equ 0 (
    echo No changes to commit.
    exit /b 0
)

git commit -m "Daily Java project update"
git push origin mk3222