print(text) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc <text>
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
>>