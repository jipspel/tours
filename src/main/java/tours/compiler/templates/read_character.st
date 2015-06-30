read_character(blocks, reader_number) ::=
<<
new java/util/Scanner
dup
getstatic java/lang/System/in Ljava/io/InputStream;
invokespecial java/util/Scanner/\<init>(Ljava/io/InputStream;)V
astore <reader_number>
aload <reader_number>
invokevirtual java/util/Scanner/next()Ljava/lang/String;
iconst_0
invokevirtual java/lang/String/charAt(I)C
<blocks; separator="\n">
>>
