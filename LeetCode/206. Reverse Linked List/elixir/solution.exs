# Definition for singly-linked list.
#
# defmodule ListNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           next: ListNode.t() | nil
#         }
#   defstruct val: 0, next: nil
# end

defmodule Solution do
  @spec reverse_list(head :: ListNode.t() | nil) :: ListNode.t() | nil
  def reverse_list(head) do
    reverse(head)
  end

  defp reverse(node, reversed_node \\ nil)
  defp reverse(nil, reversed_node), do: reversed_node

  defp reverse(node, reversed_node),
    do: reverse(node.next, %ListNode{val: node.val, next: reversed_node})
end
