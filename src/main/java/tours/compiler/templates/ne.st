ne(block, label_number) ::=
<<
<block>
if_icmpne ne_<label_number>_1
iconst_0
goto ne_<label_number>_2
ne_<label_number>_1:
iconst_1
ne_<label_number>_2:
>>
