gt(block, label_number) ::=
<<
<block>
if_icmpgt gt_<label_number>_1
    iconst_0
    goto gt_<label_number>_2
gt_<label_number>_1:
    iconst_1
gt_<label_number>_2:
>>
