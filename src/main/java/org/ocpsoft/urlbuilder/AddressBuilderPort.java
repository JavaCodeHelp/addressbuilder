package org.ocpsoft.urlbuilder;


public class AddressBuilderPort
{
   private Address parent;

   AddressBuilderPort(Address parent)
   {
      this.parent = parent;
   }

   public Address build()
   {
      return parent.build();
   }

   public AddressBuilderPath path(CharSequence path)
   {
      return parent.path(path);
   }

   public AddressBuilderQuery query(CharSequence name, Object... values)
   {
      return parent.query(name, values);
   }

   public AddressBuilderQuery query(CharSequence name, boolean encode, Object... values)
   {
      return parent.query(name, encode, values);
   }

   public AddressBuilderAnchor anchor(String anchor)
   {
      return parent.anchor(anchor);
   }  
   
   @Override
   public String toString()
   {
      return parent.toString();
   }

}
