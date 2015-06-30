read_integer(blocks, reader_number) ::=
<<
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/\<init>(Ljava/io/InputStream;)V
astore <reader_number>
aload <reader_number>
invokevirtual java/util/Scanner/nextInt()I
<blocks; separator="\n">
>>
