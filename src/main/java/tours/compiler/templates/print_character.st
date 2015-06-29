print_character(block, dup) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<block>
<dup>
invokevirtual java/io/PrintStream/println(C)V
>>
