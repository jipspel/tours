read_character(blocks, reader_number) ::=
<<
<read(reader_number, "nextLine()Ljava/lang/String;")>
iconst_0
invokevirtual java/lang/String/charAt(I)C
<blocks; separator="\n">
>>
