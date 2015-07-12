eq(block, label_number) ::=
<<
<block>
if_icmpeq eq_<label_number>_1
    iconst_0
    goto eq_<label_number>_2
eq_<label_number>_1:
    iconst_1
eq_<label_number>_2:
>>
