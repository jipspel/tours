print_dup(block, type) ::=
<<
<block>
dup
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/println(<type>)V
>>
