print_string(block, dup) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<block>
<dup>
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
>>
