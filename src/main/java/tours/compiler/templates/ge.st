ge(block, label_number) ::=
<<
<block>
if_icmpge ge_<label_number>_1
    iconst_0
    goto ge_<label_number>_2
ge_<label_number>_1:
    iconst_1
ge_<label_number>_2:
>>
