깃 브런치
112@112-11 MINGW64 /c/oss/06w
$ git init brp
Initialized empty Git repository in C:/oss/06w/brp/.git/
c
112@112-11 MINGW64 /c/oss/06w
$ cd brp

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ code login.py

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git add
Nothing specified, nothing added.
hint: Maybe you wanted to say 'git add .'?
hint: Turn this message off by running
hint: "git config advice.addEmptyPathspec false"

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git add login.py

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git commit -m 'create login'
[master (root-commit) 76b6b6b] create login
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 login.py

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git switch -c hotfix/login
Switched to a new branch 'hotfix/login'

112@112-11 MINGW64 /c/oss/06w/brp (hotfix/login)
$ echo "print('hotfix login')" >> login.py

112@112-11 MINGW64 /c/oss/06w/brp (hotfix/login)
$ git add login.py
warning: in the working copy of 'login.py', LF will be replaced by CRLF the next time Git touches it

112@112-11 MINGW64 /c/oss/06w/brp (hotfix/login)
$ git commit -m 'add hotfix login'
[hotfix/login aa1e9d3] add hotfix login
 1 file changed, 1 insertion(+)

112@112-11 MINGW64 /c/oss/06w/brp (hotfix/login)
$ git switch -
Switched to branch 'master'

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ echo "print('func1')" >> login.py

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git add login.py
warning: in the working copy of 'login.py', LF will be replaced by CRLF the next time Git touches it

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git commit -m 'Add func1'
[master f9e83a2] Add func1
 1 file changed, 1 insertion(+)

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ echo "print('func2')" >> login.py

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git add login.py
warning: in the working copy of 'login.py', LF will be replaced by CRLF the next time Git touches it

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git commit -m 'Add func2'
[master b8c3d54] Add func2
 1 file changed, 1 insertion(+)

112@112-11 MINGW64 /c/oss/06w/brp (master)
$ git switch -c feat/edit HEAD^
Switched to a new branch 'feat/edit'

112@112-11 MINGW64 /c/oss/06w/brp (feat/edit)
$ code edit.py

112@112-11 MINGW64 /c/oss/06w/brp (feat/edit)
$ git add edit.py

112@112-11 MINGW64 /c/oss/06w/brp (feat/edit)
$ git commit -m 'create edit'
[feat/edit 1a83b31] create edit
 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 edit.py

112@112-11 MINGW64 /c/oss/06w/brp (feat/edit)
--------------------------------------------------------
![1](https://user-images.githubusercontent.com/105197503/195240957-c01161a8-bb5e-4a1a-8371-8dd3b867e20f.png)
![2](https://user-images.githubusercontent.com/105197503/195240964-340bb706-c82f-4a04-9a46-73a07de6b7f3.png)
![3](https://user-images.githubusercontent.com/105197503/195240965-61b670b8-dc45-4f89-9bc4-33cfa4898554.png)
![4](https://user-images.githubusercontent.com/105197503/195240966-ee908a0e-1472-4e21-be78-46d75727be30.png)
![5](https://user-images.githubusercontent.com/105197503/195240967-1312a16d-ca92-4528-825a-ee79e3880a63.png)
![6](https://user-images.githubusercontent.com/105197503/195240970-310e78d1-cbe5-472e-bf27-23c47f4d93a4.png)
![7](https://user-images.githubusercontent.com/105197503/195240971-21b254cc-96f9-4379-ad47-4637134d0bd4.png)


