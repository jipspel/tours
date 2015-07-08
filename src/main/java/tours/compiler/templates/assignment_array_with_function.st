assignment_array_with_function(identifier_number, expressions) ::=
<<
aload <identifier_number>
<expressions; separator = "\n">
astore <identifier_number>
>>
