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
  @spec delete_duplicates(head :: ListNode.t() | nil) :: ListNode.t() | nil
  def delete_duplicates(head) do
    head
    |> node_to_list()
    |> Enum.uniq()
    |> list_to_node()
  end

  defp node_to_list(node, acc \\ [])
  defp node_to_list(nil, acc), do: acc
  defp node_to_list(node, acc), do: node_to_list(node.next, [node.val | acc])

  defp list_to_node(list, acc \\ nil)
  defp list_to_node([], acc), do: acc
  defp list_to_node([h | t], acc), do: list_to_node(t, %ListNode{val: h, next: acc})
end
