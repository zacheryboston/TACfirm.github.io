# Exploratory Data Analysis in Java 
 

## Dataset and Code
* [Amazon Rating data](https://nijianmo.github.io/amazon/index.html): use *Small* subsets for experimentation as you can directly download the following smaller per-category datasets.
* [data management](https://colab.research.google.com/drive/1Zv6MARGQcrBbLHyjPVVMZVnRWsRnVMpV) - colab notebook to parse and clean the data
* [product search](https://colab.research.google.com/drive/12r4KJVbNqjjhiZ6aeiaG809x4-Tg5fm8?usp=sharing) - colab notebook to find target products and obtain their reviews 

## Requirements

1. Select **ONE** dataset from [**Small**](https://nijianmo.github.io/amazon/index.html) subsets for exploratory data analysis 
  * K-cores (i.e., dense subsets): These data have been reduced to extract the k-core, such that each of the remaining users and items have k reviews each. Dataset chosen has to have over **100,000 reviews**
  * Ratings only: These datasets include no metadata or reviews, but only (item,user,rating,timestamp) tuples. Thus they are suitable for use with mymedialite (or similar) packages. Dataset chosen has to have over **600,000 ratings**

2.  Convert and clean up your data so that it is usable for analysis
* If the Id starts with letter B or number it is a **product**, if the Id starts with letter A it is a **reviewer** Do initial exploration of the data: 
  * data size, number of reviewers, number of products
  * graph analysis (nodes, edges, average degree, median degree)

3. Compute and output generic summary statistics and distributions on the data
   * number of reviews, number of product, network data analysis: average degree, mean degree, any other graph feature
 
4. Do specific statistical analysis of the data. Create 2 specific tables, one for products the other one for reviewers of format:
  * Id (Column A): 
  * degree (Column B): the number of times that specific Id shows up in the raw file.
  * product avg. (Column C): the computation depends if it is a product or a review, see below
  * reviewer avg (Column D): the computation depends if it is a product or a review, see below
  
```
Id,degree,product avg,reviewer avg
A00625243BI8W1SSZNLMD,8,4.875,4.486763483 
```
For **reviewer** (Id starts with letter A): 
* **degree** marks the number of reviews from Id (appearance in Column A). 
* Statistics of **all** possible reviews (from other reviewers and this reviewer) of **all** products **reviewer** scored is computed and stored as: 
  * product avg. (Column C)
* Statistics of all review scores **reviewer** provided is computed and stored as: 
  * reviewer avg (Column D)

```
Id,degree,product avg,reviewer avg
B00I3MPDP4,455,4.23,3.98
```
For **product** (Id does not start with letter A)
* **degree** marks the number of reviews from Id (appearance in raw file Column B)
* Statistics of **all** possible review of the product is computed and stored as: 
  * product avg. (Column C)
* Statistics of **all** possible reviews from  **all** **reviewers** that reviewd this specific **product** is computed and stored as:
  * reviewer avg (Column D)

5. Compute and output TEN rows for which the discrepancies between product avg and reviewer avg (columns C and D) is the largest. 
``` Id,degree,product avg,reviewer avg
```` 

6. You can have one or more java classes for the project. Submit to class git before the deadline
