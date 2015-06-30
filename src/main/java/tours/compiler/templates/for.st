for(initialization, termination, increment, block_for, label_number) ::=
<<
<initialization>
for_<label_number>:
<termination>
ifle end_for_<label_number>
<block_for>
<increment>
goto for_<label_number>
end_for_<label_number>:
nop
>>