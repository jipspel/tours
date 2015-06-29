le(block, label_number) ::=
<<
<block>
if_icmple LBL<label_number>_1
iconst_0
goto LBL<label_number>_2
LBL<label_number>_1:
iconst_1
LBL<label_number>_2:
>>
