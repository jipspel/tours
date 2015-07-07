assignment_array_initialisation(index, expressions, store_type) ::=
<<
dup
ldc <index>
<expressions>
<store_type>astore
>>
