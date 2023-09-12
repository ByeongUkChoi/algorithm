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
  @spec middle_node(head :: ListNode.t() | nil) :: ListNode.t() | nil
  def middle_node(head) do
    list = to_list(head)

    list
    |> Enum.slice(0, div(length(list) + 1, 2))
    |> to_struct()
  end

  defp to_list(node, acc \\ [])
  defp to_list(nil, acc), do: acc
  defp to_list(node, acc), do: to_list(node.next, [node.val | acc])

  defp to_struct(list, acc \\ nil)
  defp to_struct([], acc), do: acc
  defp to_struct([h | t], acc), do: to_struct(t, %ListNode{val: h, next: acc})
end
