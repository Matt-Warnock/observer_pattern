# Observer Pattern

## Pattern Description

Kind of like how a subscription service works(publishers send to their subscribers, except we call the publisher the SUBJECT and the subscribers the OBSERVERS.


The Observer pattern defines a one-to-many dependency so that when one object updates its state, all of its dependents are notified and updated automatically. 

## This example 
This is a non-functioning, striped down version of a weather updating system.
It illustrates the solution to updating many possible display APIs at the same time with the same data, every time the weather changes.
