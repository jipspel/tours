lt(block, label_number) ::=
<<
<block>
if_icmplt lt_<label_number>_1
iconst_0
goto lt_<label_number>_2
lt_<label_number>_1:
iconst_1
lt_<label_number>_2:
>>
