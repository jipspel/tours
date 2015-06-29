print_integer(block, dup) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<block>
<dup>
invokevirtual java/io/PrintStream/println(I)V
>>
