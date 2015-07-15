compare(op, label_number) ::=
<<
if_icmp<op> <op>_<label_number>_1
    iconst_0
    goto <op>_<label_number>_2
<op>_<label_number>_1:
    iconst_1
<op>_<label_number>_2:
>>
