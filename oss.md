

-------------------------------------------------------------------------------------------------------------------------
[기말고사]

stash: 
놓다, 남겨두다, 감추다, 안전한 곳에 숨겨두다
커밋할 필요 없이 파일의 변경사항을 숨기건 비밀리에 저장할 수 있는 도구
WD, SA의 원래의 내용을 stash 스택에 저장
WD, SA -> GR의 마지막 커밋으로
따로 저장했다가 다시 가져올 수 있는 기능
저장내용: 작업 디렉토리 내용과 스테이지 내용

깃에서 임시저장소(스택구조)에 저장: 
-Stack of git stashes
가장 최근의 내용이 가장 위에 저장되는 구조

작업 디렉토리가 정리(클린)되고 git이 추적한 모든 파일이 스택에 저장됨
**마지막 저장냉용이 워킹디렉토리와 스테이징 에어리어의 냉용이 같은 상태를 클린하다 함
   워킹디렉토리 클린상태면 소스트리에 '커밋되지 않은 변경사항'이 뜨지 않음

stash는 WD와 SA의 내용을 stash라는 장소에 저장한다
Stash로 저장되는 내용은 작업 디렉토리 내용과 스테이지 내용이다

git stash: 
WD아 SA의 내용을 stash에 저장한다

git stash apply: 
index 스테이지 영역의 냉용도 저장

git stash list: 
stash의 몇개의 stash파일이 있는지 뛰움

git stash show: 
stash에 몇줄이 추가 됬는지 간단하게 표시

git stash show -p: 
stash에 몇줄이 추가됬는지 자세하게 표시

git stash show -p stash@{N}: 
stash에 추가된 파일중 N번째 파일의 추가 내용을 자세하게 표시

touch [파일이름].py: 
리누스 명령어
내용이 없는 파일을 생성

git stash -m '쓸 내용': 
git stash list에 stash@{N}: On master: 쓴내용 이뜸

git stash apply --index :
index로 저장되어있던 것을 다시 스테이지에 반영

git stash --keep-index: 
현재 상태에서 스테이징 에어리어는 그대로 남기고 WD만 임시저장에 저장
스테이징 에어리어는 임시저장에 제외하고 저장

git stash -u: 
언트렉티드파일은 stash에 일반적으로 저장이 안됨
이 명령어는 언트렉티드파일을  stash에 저장

git stash branch [브랜치이름]: 
브랜치를 만들고 임시저장을 적용하고 적용된 임시저장은 삭제
git stash list를 확인해보면 한줄이 사라진걸 볼 수 있음

git stash pop: 
가장 최근의 임시저장을 적용하고 임시저장 목록에서 제거
git stash list를 확인하면 한줄이 사라진걸 볼 수 있음

git stash drop: 
가장 최근 임시저장 삭제

git stash drop stash@{N}: 
N번째 저장된 임시저장 삭제

git clean -f: 
언트렉티드파일은 그냥 git clean으로는 안지워짐, 강제 삭제인 -f를 써야됨

git clean -n: 
내가 지울 수 있는 언트렉티드 파일들을 보여줌

git clean -i: 
언트렉티드파일에 대해 할 수 있는 6가지의 선택지를 뛰움
숫자가 아닌 컬러로 표시된 알파벳을 입력해야 그 동작을 실행

$ git init	.git:
하위 디렉토리 생성
(폴더를 만든 후, 그 안에서 명령 실행 => 새로운 git저장소 생성)

$ git clone /로컬/저장소/경로	:
로컬 저장소 복제

$ git clone 사용자명@호스트:/원격/저장소/경로 :	
원격 서버 저장소 복제

$ git add *	:
커밋에 단일 파일의 변경 사항을 포함
(인덱스에 추가된 상태)

$ git add -A :	
커밋에 파일의 변경 사항을 한번에 모두 포함

$ git commit -m "커밋 메시지"	:
커밋 생성
(실제 변경사항 확정)

$ git status:	파일 상태 확인

$ git branch <브랜치이름>	: 새 브랜치 생성 (local로 만듦)

$ git checkout -b <브랜치이름>	: 브랜치 생성 & 이동

$ git checkout master	master branch로 되돌아 옴

$ git branch -d <브랜치이름>	브랜치 삭제

$ git push origin <브랜치이름>	만든 브랜치를 원격 서버에 전송

$ git push -u < remote > <브랜치이름>	새 브랜치를 원격 저장소로 push

$ git pull < remote > <브랜치이름>	원격에 저장된 git 프로젝트의 현재 상태를 다운받고 + 현재 위치한 브랜치로 병합

<변경 사항 발행(push)>	$ git push origin master	변경사항 원격 서버에 업로드

$ git push < remote > <브랜치이름>	커밋을 원격 서버에 업로드

$ git push -u < remote > <브랜치이름>	커밋을 원격 서버에 업로드

$ git remote add origin <등록된 원격 서버 주소>	클라우드 주소 등록 및 발행

(git에게 새로운 원격 서버 주소 알림)

$ git remote remove <등록된 클라우드 주소>	클라우드 주소 삭제

<갱신 및 병합(merge)>	$ git pull	원격 저장소의 변경 내용이 현재 디렉토리에 가져와지고(fetch) 병합(merge)됨

$ git merge <다른 브랜치이름>	현재 브랜치에 다른 브랜치의 수정사항 병합

$ git add <파일명>	각 파일을 병합할 수 있음

$ git diff <브랜치이름><다른 브랜치이름>	변경 내용 merge 전에 바뀐 내용을 비교할 수 있음

<태그tag 작업>	$ git log	현재 위치한 브랜치 커밋 내용 확인 및 식별자 부여됨

<로컬 변경사항 return 작업>	$ git checkout -- <파일명>	로컬의 변경 사항을 변경 전으로 되돌림

$ git fetch origin	원격에 저장된 git프로젝트의 현 상태를 다운로드

