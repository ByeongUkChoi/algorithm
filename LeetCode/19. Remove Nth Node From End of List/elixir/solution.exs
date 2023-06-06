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
  @spec remove_nth_from_end(head :: ListNode.t() | nil, n :: integer) :: ListNode.t() | nil
  def remove_nth_from_end(%{next: nil}, _n) do
    nil
  end

  def remove_nth_from_end(head, n) do
    head
    |> to_value_list()
    |> List.delete_at(n - 1)
    |> to_list_node_struct()
  end

  defp to_value_list(node, acc \\ []) do
    case node do
      %{next: nil} -> [node.val | acc]
      %{next: next} -> to_value_list(next, [node.val | acc])
    end
  end

  defp to_list_node_struct(list, acc_node \\ nil)

  defp to_list_node_struct([], acc_node) do
    acc_node
  end

  defp to_list_node_struct([h | t], acc_node) do
    to_list_node_struct(t, %ListNode{val: h, next: acc_node})
  end
end
