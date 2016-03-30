

gcc -Wl,--kill-at  -I E:\work\eclipse_3.7.2_myeclipse10.7\TestJNIC    -shared -o Test.dll Test.c
1.用MinGW 编译dll文件时，一定要加--kill-at 参数。


javah为jdk的工具，可生成 c++ 头文件。供 c++ 程序使用
javah -jni  -classpath E:\work\eclipse_3.7.2_myeclipse10.7\TestJNI\bin  mmlvkk.Test


