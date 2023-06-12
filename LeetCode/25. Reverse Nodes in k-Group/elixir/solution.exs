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
  @spec reverse_k_group(head :: ListNode.t() | nil, k :: integer) :: ListNode.t() | nil
  def reverse_k_group(head, k) do
    {list, length} = node_to_list(head)
    pad_size = k - rem(length, k)
    list = List.duplicate(nil, pad_size) ++ list

    list
    |> Enum.chunk_every(k)
    |> Enum.map(&reverse_group_list/1)
    |> Enum.reduce(nil, fn list, acc ->
      to_list_node_struct(list, acc)
    end)
  end

  defp node_to_list(head, acc_list \\ [], length \\ 0)

  defp node_to_list(nil, acc_list, length) do
    {acc_list, length}
  end

  defp node_to_list(node, acc_list, length) do
    node_to_list(node.next, [node.val | acc_list], length + 1)
  end

  defp reverse_group_list([nil | _] = list) do
    Enum.reject(list, &is_nil/1)
  end

  defp reverse_group_list(list) do
    Enum.reverse(list)
  end

  defp to_list_node_struct([], acc_node) do
    acc_node
  end

  defp to_list_node_struct([h | t], acc_node) do
    to_list_node_struct(t, %ListNode{val: h, next: acc_node})
  end
end
