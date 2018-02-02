@TableGenerator注解属性解释：

         name属性表示该表主键生成策略的名称，它被引用在@GeneratedValue中设置的“generator”值中。

         table属性表示表生成策略所持久化的表名。

         catalog属性和schema具体指定表所在的目录名或是数据库名。

         pkColumnName属性的值表示在持久化表中，该主键生成策略所对应键值的名称。

         valueColumnName属性的值表示在持久化表中，该主键当前所生成的值，它的值将会随着每次创建累加。

         pkColumnValue属性的值表示在持久化表中，该生成策略所对应的主键。

         initialValue表示主键初识值，默认为0。

         allocationSize表示每次主键值增加的大小，默认为50。