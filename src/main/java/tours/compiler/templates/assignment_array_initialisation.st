assignment_array_initialisation(index, expressions, store_type) ::=
<<
dup
bipush <index>
<expressions>
<store_type>astore
>>
