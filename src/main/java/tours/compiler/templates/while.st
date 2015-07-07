while(expression, block_while, label_number) ::=
<<
while_<label_number>:
<expression>
ifle while_end_<label_number>
<block_while>
pop
goto while_<label_number>
while_end_<label_number>:
nop
>>
