```mermaid
%%{init: { 'theme': 'default' , 'themeVariables': {
              'cScale0': '#26DFD0', 'cScaleLabel0': '#555555',
              'cScale1': '#F62AA0', 'cScaleLabel1': '#555555',
              'cScale2': '#B8EE30', 'cScaleLabel2': '#555555'
       } } }%%
timeline
    first : next changes are made immediately easier
        : code readability is improved
    after : the same area of code is likely to change soon
        : it's cheaper to tidy soon
        : cost (tidying) <= cost (behavior change)
    later : could be done "after" if you had enough time
        : will be cheaper once easier changes have been done
        : reserve this for the "fun list"
    never : the behavior likely won't change
        : "if it ain't broke don't fix it"
 ```
