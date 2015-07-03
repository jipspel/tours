assignment_array(identifier_number, expressions, store_type) ::=
<<
aload <identifier_number>
<expressions; separator = "\n">
<store_type>astore
>>
