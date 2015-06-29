print_string(block) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<block>
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
>>
