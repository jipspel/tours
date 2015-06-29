print_integer(block) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<block>
invokevirtual java/io/PrintStream/println(I)V
>>
