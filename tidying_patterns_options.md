```mermaid
graph LR;
  GC(guard clause)-->EH(extract helper) & EC(explaining constant) & RO(reading order) & NS;
  NS(normalize symmetries)-->GC & EH & DRC(delete redundant comments);
  NIOI(new interface, old implementation)-->ZIC[/improve cohesion/] & RC(reduce coupling);
  CO(cohesion order)-->EH;
  MDIT(move declaration and initialization together)-->EH & CO;
  EV(explaining variables)-->DRC & EH & CO;
  EC-->DRC & ZIC;
  EP(explicit parameters)-->EV & ZIC;
  CS(chunk statements)-->EH & EV & EC;
  EH-->RO & OP(one pile) & CO & NIOI & ZRFU[/replace former uses with the new helper/];
  OP--> CS & CO & EH & MDIT;
  ECO(explaining comments)-->DRC;
```

```mermaid
graph LR;
  DC(dead code)-->ZS[/see more clearly and make other tidyings explicit/];
```
