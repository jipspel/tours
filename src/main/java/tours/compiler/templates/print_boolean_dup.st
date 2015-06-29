print_boolean_dup(block) ::=
<<
<block>
dup
getstatic java/lang/System/out Ljava/io/PrintStream;
swap
invokevirtual java/io/PrintStream/println(Z)V
>>
