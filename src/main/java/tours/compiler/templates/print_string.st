print_string(text_command) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<text_command>
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
>>
