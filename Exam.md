# 考試
1. JAVA 為高階程式語言
2. Java程式運作的方式是採先編譯後直譯：一支Java程式首先必須經由Java編譯器編譯成位元碼（Byte Code），位元碼搭配Java虛擬機器（JVM）便是Java得以跨平台的原因，JVM便是直譯器（interpreter），讓這支Java程式得以在該平台上執行，如此便可不用修改原始碼而直接移到不同的電腦平台上執行。
3. JDK包含執行和開發需要的檔案和工具, JRE只有執行時期所需的檔案
4. 程式架構:
    * Package:套件被設計與檔案系統結構相對應
    * import:使用「完全描述」（Fully qualified）名稱來指定使用的類別，當然這個方法要打一長串的文字，因而使用上不是很方便，您可以使用 "import" 關鍵字，告知編譯器您所要使用的類別是位於哪一個套件
    * class:類別,用來定義物件,函式,成員變數,介面...等
5. 註解
```=java
/* This is a comment. */
// This is also a comment.
/** 文件式註解 */
```
6. 程式結束的敍述
```=java
return;
System.exit(0);
```
7. Java副檔名: .java
8. 控制邏輯
```=java
if(條件式) {
    陳述句一;
    陳述句二;
 }
 else {
    陳述句三;
    陳述句四;
 }
 
 switch(變數名稱或運算式) { 
    case 符合數字或字元: 
        陳述句一; 
        break; 
    case 符合數字或字元: 
        陳述句二; 
        break; 
    default: 
        陳述三; 
 } 


for(初始式; 判斷式; 遞增式) {
    陳述句一; 
    陳述句二; 
 }
 
while(條件式) {
    陳述句一; 
    陳述句二; 
} 

do { 
    陳述句一; 
    陳述句二; 
    .... 
 } while(條件式);
```
9. for-in for-each
```=java
for（聲明：表達式）
  语句
  
for (int n : primes) {
    out.println(n);
  }
```
並非只有Collection介面的實作物件，才可以搭配foreach語法，事實上，由於Iterable介面的引進，使得只要是實作Iterable介面的物件，皆可搭配foreach語法來使用。例如：
```=java
public void go(Iterable<String> iterable) {
    for(String element : iterable) {
        System.out.println(element);
    }
}
```

10. Java Naming rule
    * Class Name請首字大寫 第一個字元不可以為數字，可以是英文字母或底線 _ 或錢字號 $ ，命名長度沒有現制，但有大小寫之分，且不可使用關鍵字。
    
    * Variable Name(變數名稱)和Method Name(方法名稱)請首字小寫如果名稱由數個英文字組成,第二個英文字以後首字大寫 例如==> String studentName = "lucy"; 不可使用關鍵字。如變數經由 final 修飾元宣告的變數及為常數，該變數的值就不能再作更改且命名已全部大寫英文字母，常數有 static 的特性(類似類別變數)全域都可存取該常數。
    
    * 寫作實內縮四個空格
    
    * 註解部分如要變成說明文件,請遵照javadoc這個工具的寫作規則 

11. Java保留字

```
關鍵字 (keyword) 為具有語法功能的保留字 (reserved word) ，Java 的關鍵字共有 50 個，如以下列表

abstract	continue	for	new	switch
assert***	default	goto*	package	synchronized
boolean	do	if	private	this
break	double	implements	protected	throw
byte	else	import	public	throws
case	enum****	instanceof	return	transient
catch	extends	int	short	try
char	final	interface	static	void
class	finally	long	strictfp**	volatile
const*	float	native	super	while

*	保留的關鍵字，很少使用
**	Java 1.2 新增
***	Java 1.4 新增
****	Java 5.0 新增
```

12. 八種基本型態
Java 有八種基本資料型態 (primitive data type) ，分別使用關鍵字 boolean 、 byte 、 char 、 double 、 float 、 int 、 long 、 short 。

13. 多維陣列
```=java
int[][] x;
x = new int[10][20];
for (int i = 0; i < x.length; i++) {
    for (int j = 0; j < x[i].length; j++) {
        x[i][j] = i + j;
    }
}
        
int b[][][]={{{50,30},{20,100}},{{50,50},{100,100}}};
int min,max;

min=max=b[0][0][0]; //以第一個數字為比大小對象

for(int i=0;i<b.length;i++)
{
   for(int j=0;j<b[i].length;j++)
   {
       for(int k=0;k<b[i][j].length;k++)
       {https://flatearth.fluxfingers.net/challenges
            sum+=b[i][j][k];//數字累加
            if(b[i][j][k]>max) max=b[i][j][k];//如果比目前Max值大就把這個值代入給Max
            if(b[i][j][k]<min) min=b[i][j][k];//如果比目前Min值小就把這個值代入給Min
            System.out.println("b["+i+"]["+j+"]["+k+"]="+b[i][j][k]);//顯示三維陣列每個值
            no++;//紀錄迴圈次數
        }
    }
}
```

14. 運算子 運算元

Java 提供多樣、功能完整的運算子 (operator) ，依運算子結合後運算的優先次序，如下列表
```
名稱	優先順序
後綴	expr++, expr--
單元	++expr, --expr, +expr, -expr, ~, !
乘除	*, /, %
加減	+, -
位移	<<, >>, >>>
關係	<, >, <=, >=, instanceof
相等性	==, !=
位元且	&
位元互斥或	^
位元包含或	|
邏輯且	&&
邏輯或	||
條件	? :
指派	=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=

運算子（Operator）

運算元（operand）

3+4=7
+ =  都是Operator

3%4=3
% = 都是Operator

而 3 4 7這些數字 都是operand
```
15. 共用物件,不共用物件
宣告為static靜態變數時,為共用物件
宣告為成員變數時,則不共用物件

16. 合法的建構子
 建構子宣告時有三個特點需要注意：

* 建構子的名稱就是類別的名稱
* 建構子沒有傳回值型態的宣告
* 一個類別程式可已有多個建構子，差異在參數列的變化

例如：

    public class Test {

        public Test() {....} //這是一個合法的建構子

        public Test(int d) {....} //這也是一個合法的建構子

        public void Test() {...} // 這不是建構子，但是是一個物件動作（無傳回值）

        public double Test() {...} // 這不是建構子，但是是一個物件動作（傳回值是double型實數）

    }

17. Overloading, Overriding
Overloading有人將他稱為「多載」，是指說在「相同類別」中，定義「名稱相同」，但是「引數個數不同」，或是「引數型態不同」的函式，這樣JAVA就可以根據引數的個數，或是引數的型態，呼叫到對應的函式。Overriding 則是覆寫掉父類別中的函式。

 

首先，先舉例一下 Overloading，而 Overloading 就以JAVA中最常見也是最常用的 Arrays 類別為例子，引數不同，但函式名稱相同為必要條件。

```=java
static int binarySearch(byte[] a, byte key);
static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key);
```

以 Overriding 來說，舉例而言：
```=java
class Animal{
    protected int legs = 1;
    public int getLegs(){
      return legs*4;
    }
}
class Bird extends Animal{
   public int getLegs(){
       return legs*2;
   }
}
```
同樣都是有「getLegs()」這個函式，雖然「回傳值」不同，但是「回傳值的型態」均相同，這就是 Overriding，只發生在「繼承」的關係中，子類別會將父類別的函式覆蓋掉，可以看為函式的改寫。

18. super

```=java
使用super保留字來呼叫父類別的成員
super通常有兩種用途  
第一種是讓子類別用來呼叫父類別的建構式(ConsTructor)
第二種是在子類別中透過super來呼叫父類別那些相同名稱的的成員
語法如下
super([引數串列])          //呼叫父類別的建構式
super.資料成員             //存取父類別的資料成員
super.方法成員([引數串列]) //呼叫父類別的方法成員
```

19. final
final 修飾，表示該成員為常數 (constant) ，屬性 (field) 或區域變數 (local variable) 都不能重新給值，而方法 (method) 繼承 (inherit) 後不可被改寫 (override) 。

20. try-catch-finally
* try：如果想要在method裡面捕捉例外，必須要可能發生例外的程式碼放到try block裡面，否則例外只能往外傳遞。

* catch：catch block一定會跟在try block後面，如果想捕捉try block所發生的例外，就把這個例外的型態寫在catch子句裡面，例如catch(IOException e)就可以捕捉到IOException這種型態的例外。如果想要捕捉多種例外型態，就必須要撰寫多個catch block

* finally:最後這個finally block是用來釋放在try block裡面所使用的資源。不管在try block是否發生例外，只要寫了finally block，程式的執行順序最後一定會跑到這裡面。就算是直接在try或是catch裡面使用return指令，finally block也還是會被執行。 

```=java
public void try_multiple_catch(){
    try{
        throwIOException();
        throwSQLException();
    }

    catch(IOException e){
    }
    catch(SQLException e){
    }
    catch(Exception e){
      // blanket catch
    }
}
```

上面程式範例的try block呼叫throwIOException()與throwSQLException()這兩個method，他們分別會丟出IOException與SQLException。為了捕捉這兩個例外，需要寫兩個catch block（6~9行）。最後catch(Exception e)的這個catch block有一個術語，叫做blanket catch，用來捕抓除了Error型態以外的全部例外。這種寫法是因為有時候鄉民們不希望自己的method丟出例外，因此用一個blanket catch把所有例外都捕捉起來。由於Error例外在Java語言中代表嚴重的錯誤，通常是由JVM所發出，例如OutOfMemoryError，而且一旦發生大部分的情況會導致程式終止。因此blanket catch通常只捕捉Exception而非Throwable。但如果鄉民們在某種特殊情況下想要連Error都一起捕捉，則可以用catch(Throwable e)的方式來實作blanket catch。
