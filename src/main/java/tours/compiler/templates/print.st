print(block, type) ::=
<<
getstatic java/lang/System/out Ljava/io/PrintStream;
<block>
invokevirtual java/io/PrintStream/println(<type>)V
>>
