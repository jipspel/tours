lt(block, label_number) ::=
<<
<block>
if_icmplt LBL<label_number>_1
iconst_0
goto LBL<label_number>_2
LBL<label_number>_1:
iconst_1
LBL<label_number>_2:
>>
