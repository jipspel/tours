le(block, label_number) ::=
<<
<block>
if_icmple le_<label_number>_1
    iconst_0
    goto le_<label_number>_2
le_<label_number>_1:
    iconst_1
le_<label_number>_2:
>>
