print_character(block) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<block>
invokevirtual java/io/PrintStream/println(C)V
>>
