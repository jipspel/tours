print_integer(text_command) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<text_command>
invokevirtual java/io/PrintStream/println(I)V
>>
